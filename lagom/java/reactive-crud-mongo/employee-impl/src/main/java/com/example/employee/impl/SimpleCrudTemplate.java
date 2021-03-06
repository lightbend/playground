package com.example.employee.impl;

import akka.Done;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.bson.Document;

import java.util.List;
import java.util.concurrent.CompletionStage;

public interface SimpleCrudTemplate<T> {

    CompletionStage<Done> create(T t) throws JsonProcessingException;

    CompletionStage<T> retrieve(String id);

    CompletionStage<Done> update(T t) throws JsonProcessingException;

    CompletionStage<Done> delete(String id);

    CompletionStage<List<T>>  getDocs ();
}
