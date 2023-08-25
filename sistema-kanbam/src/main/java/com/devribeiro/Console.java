package com.devribeiro;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.devribeiro.enuns.Status;

public class Console {
    public void start()  {
        Kanban kanban = new Kanban();
        while(true){
            Scanner input = new Scanner(System.in);
            Scanner line = new Scanner(System.in);
            Menu();
            int op = input.nextInt();

            if(op==1){
              kanban.listAllTasks();  
            }else if(op==2){
                System.out.println("Deseja Filtar por Status digite 1 ");
                System.out.println("Deseja Filtar por ID digite 2 ");
                System.out.println("Para Voltar ao Menu digite 0 ");
                op = input.nextInt();
                if(op==1){
                    System.out.println("1- "+Status.PARA_FAZER+" 2- "+Status.ESPERANDO+" 3- "+Status.TRABALHANDO+" 4- "+Status.FEITO);
                    op = input.nextInt();
                    if(op==1){
                      System.out.println("Tarefas a Fazer: ");  
                      System.out.println("================="); 
                      kanban.listTaskStatus(Status.PARA_FAZER);  
                    }else if(op==2){
                      System.out.println("Tarefas Esperando: ");
                      System.out.println("=================");     
                      kanban.listTaskStatus(Status.ESPERANDO);  
                    }else if(op==3){
                      System.out.println("Tarefas Trabalhando: ");
                      System.out.println("=================");  
                      kanban.listTaskStatus(Status.TRABALHANDO);  
                    }else if(op==4){
                      System.out.println("Tarefas Finalizadas: "); 
                      System.out.println("=================");   
                      kanban.listTaskStatus(Status.FEITO);  
                    }else{
                        System.out.println("Opção invalida, retornando para o Menu"); 
                        try{TimeUnit.SECONDS.sleep(2);
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            continue;

                    }

                    

                }else if(op==2){
                    System.out.println("Digite a ID: ");
                    op = input.nextInt();
                    kanban.listTaskid(op);

                }else{
                    System.out.println("Opção invalida, retornando para o Menu"); 
                        try{TimeUnit.SECONDS.sleep(2);
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            continue;

                }
            }else if(op==3){
                System.out.println("Digite o nome da Tarefa");
                String taskNome = line.nextLine();
                kanban.createTask(taskNome);

            }else if(op==4){
                System.out.println("Digite o Id da tarefa: ");
                op= input.nextInt();
                System.out.println("1- "+Status.PARA_FAZER+" 2- "+Status.ESPERANDO+" 3- "+Status.TRABALHANDO+" 4- "+Status.FEITO);
                int newStatus= input.nextInt();
                if(newStatus==1){
                    kanban.upStatusTaskid(op,Status.PARA_FAZER);  
                     System.out.println("Tarefas atualizada como PARA_FAZER");  
                      System.out.println("================="); 
                    }else if(newStatus==2){
                       kanban.upStatusTaskid(op,Status.ESPERANDO);  
                        System.out.println("Tarefas atualizada como ESPERANDO");  
                      System.out.println("=================");
                    }else if(newStatus==3){
                      System.out.println("Tarefas Trabalhando: ");
                      System.out.println("=================");  
                      kanban.upStatusTaskid(op,Status.TRABALHANDO); 
                       System.out.println("Tarefas atualizada como TRABALHANDO");  
                      System.out.println("================="); 
                    }else if(newStatus==4){
                      
                      kanban.upStatusTaskid(op,Status.FEITO);  
                       System.out.println("Tarefas atualizada como FEITO");  
                      System.out.println("=================");
                    }else{
                        System.out.println("Opção invalida, retornando para o Menu"); 
                        try{TimeUnit.SECONDS.sleep(2);
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            continue;

                    }
                

            }else if(op==5){
                System.out.println("Até mais, Encerrando...");
                try{TimeUnit.SECONDS.sleep(2);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                break;
            }else {
                 System.out.println("Opção Invalida, Escolha novamente ");
                 try{TimeUnit.SECONDS.sleep(3);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
            }
            


        }
    }

    private void Menu(){
        System.out.println("Escolha uma Opção: ");
        System.out.println("1 - Listar tarefas: ");
        System.out.println("2 - Filtrar tarefas: ");
        System.out.println("3 - Criar tarefas ");
        System.out.println("4 - Atualizar tarefas: ");
        System.out.println("5 - Sair do Sistema ");



    }
    
}
