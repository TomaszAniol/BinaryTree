package com.tomasaniol;

public class Lista {

    private String name = "";
    private Lista lista = null;
    private boolean isReached = false;

    public void AddName(String name){
        if (this.name.isEmpty()){
            this.name = name;
        }
        else {
            if (this.lista == null){
                this.lista = new Lista();
                this.lista.AddName(name);
            }
            else {
                this.lista.AddName(name);
            }

        }

    }

    String totalName = "";

    public void TakeOut(){
        if (this.lista == null) {

        }
        else {
            lista.TakeOut();
        }
        System.out.println(name);
    }

    public void TakeOutNext(){
        if (this.lista == null) {
            System.out.println("You can't go further");
        }
        else if(!isReached){
            System.out.println(name);
            isReached = true;
        }
        else {
            lista.TakeOutNext();
        }
    }

    public void TakeOutPrevious(){
        if (this.lista == null){

        }
        else if (!lista.isReached){
            System.out.println(name);
            isReached = false;
        }
        else {
            lista.TakeOutPrevious();
        }
    }
}
