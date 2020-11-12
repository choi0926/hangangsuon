package com.choi.hangangsuon.response;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response<T> {

    private String status;
    private String message;
    private T data;
}
