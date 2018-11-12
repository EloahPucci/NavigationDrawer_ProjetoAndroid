package com.example.eloah.navigationdrawer.services;

import com.example.eloah.navigationdrawer.model.Aluno;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface InterfaceDeServicos {
    @Headers("Content-Type: application/json; charset=utf-8")
    @GET("/lista_de_alunos")
    Call<List<Aluno>> webserviceNotasDeAlunos();

}
