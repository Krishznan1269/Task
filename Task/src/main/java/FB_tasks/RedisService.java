package FB_tasks;

import redis.clients.jedis.Jedis;

public class RedisService {
    private final Jedis jedis;

    public RedisService() {
        this.jedis = new Jedis("localhost", 6379);
    }

    public String getRecord(String key) {
        return jedis.get(key);
    }

    public void setRecord(String key, String value) {
        jedis.set(key, value);
    }

    public void deleteRecord(String key) {
        jedis.del(key);
    }

    public void close() {
        jedis.close();
    }
}
