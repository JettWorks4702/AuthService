package org.example.serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;
import org.example.model.UserInfoDto;

import java.util.Map;

public class UserInfoSerializer implements Serializer<UserInfoDto> {
    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
    }

    @Override
    public byte[] serialize(String arg1, UserInfoDto arg2){
        byte[] result = null;
        ObjectMapper mapper = new ObjectMapper();
        try{
            result = mapper.writeValueAsString(arg2).getBytes();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void close() {
        // intentionally left blank
    }

}
