/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author 13912471673
 */
public class BinarySearchTree <T extends Comparable<T>>{
    Node raiz;// a raiz começa de nulo
    private int comparacoes = 0; 
    
    public void add(T novoDado){
        Node<T> novoNo = new Node<T>(novoDado);
        raiz = inserir(raiz, novoNo);
    }
    
    private Node<T> inserir(Node<T> raiz, Node<T> novo){
        if(raiz == null) {
            comparacoes++; 
            raiz = novo;
            return raiz;
        }
        if(novo.dado.compareTo(raiz.dado) < 0){
            comparacoes++; 
            raiz.esquerda = inserir(raiz.esquerda, novo);
        }
        else
            raiz.direita = inserir(raiz.direita, novo);
        return raiz;
    }// fim funcao inserir
  
    public int getComparacoes() {
        return comparacoes;
    }
    
    
    public void preOrder(){
        preOrder(raiz);
    }
    
    public void posOrder(){
        posOrder(raiz);
    }
    
    public void inOrder(){
        inOrder(raiz);
    }
    
    private void preOrder(Node<T> node) {
        if (node != null) {
        System.out.print(node.dado + " ");
        preOrder(node.esquerda);
        preOrder(node.direita);
        }
    }
    
    private void inOrder(Node<T> node) {
        if (node != null) {
        inOrder(node.esquerda);
        System.out.print(node.dado + " ");
        inOrder(node.direita);
        } 
    }
    
    private void posOrder(Node<T> node) {
        if (node != null) {
        posOrder(node.esquerda);
        posOrder(node.direita);
        System.out.print(node.dado + " ");
        }
    }
  
}    
