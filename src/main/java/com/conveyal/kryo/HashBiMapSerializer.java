package com.conveyal.kryo;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.serializers.MapSerializer;
import com.google.common.collect.HashBiMap;

import java.util.Map;

/**
 * For HashBiMap standard map serialization works fine, but we need to tell it how to create an empty instance.
 * Created by abyrd on 2018-10-25
 */
public class HashBiMapSerializer extends MapSerializer {

    protected Map create(Kryo kryo, Input input, Class<Map> type) {
        return HashBiMap.create();
    }

}
