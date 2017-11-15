/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.eteczonaleste.entity;

import java.util.Comparator;

/**
 *
 * @author wagner
 */
public class AlunoComparator implements Comparator<Alunos>{

    public int compare(Alunos aluno1, Alunos aluno2) {
      return aluno1.getNome().compareTo(aluno2.getNome());
    }
    
}
