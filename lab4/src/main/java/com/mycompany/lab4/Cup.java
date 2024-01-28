/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author paperpepper
 */
public class Cup {
    public int Current;
    public int Max;
    public String Name;
    public Cup(String name,int value){
        Name=name;
        Max=value;
    }
    public void interFace (){
        System.out.println (Name);
        System.out.println ("MaxValue "+ Max);
        System.out.println(Name+" น้ำปัจจุบัน " +Current+"/"+Max);
        System.out.println(" ");
    }
    public void addWater(int water){
        int left;
        Current += water;
        left = Max-Current;
        System.out.println(Name+" เติมน้ำ " +water);
        if(Current <= Max){
            System.out.println(Name+" น้ำปัจจุบัน " +Current+"/"+Max);

        }
        else if(Current > Max){
            Current = Max;
            System.out.println(Name+" น้ำปัจจุบัน " +Current+"/"+Max);
            System.out.println(Name+" จำนวนที่เกิน " +Math.abs(left));
        }
        System.out.println(" ");
    }
    public void addMaxWater(){
        Current=Max;
        System.out.println(Name+" เติมจนเต็ม " +Current+"/"+Max);
        System.out.println(" ");
    }
    
    public void tranfer(Cup other,int water){
        int left;
        int CurrentWater;
        if(this.Name.equals(other.Name)){
            System.out.println("ไม่สามารถลงหม้อเดียวกันได้");
        }
        
        else if(Current >= water){ 
            CurrentWater=other.Current;
            other.Current += water;
            left = other.Max-other.Current;
            if(other.Current <= other.Max){
                String formattedString = String.format("%s มีน้ำ %d/%d : %s มีน้ำ %d/%d ***%s เติมน้ำให้ %s*** จำนวน %d ",Name,Current,Max,other.Name,CurrentWater,other.Max,Name,other.Name,water);
                System.out.println(formattedString);
                if (Current >= water){
                    Current-=water;
                }
                System.out.println(Name+" น้ำปัจจุบัน " +Current+"/"+Max);
                System.out.println(other.Name+" น้ำเหลือ "+other.Current+"/"+other.Max);
                System.out.println(other.Name+" พี้นที่ที่เหลือ " +Math.abs(left));
            }
            else if(other.Current > other.Max){
                other.Current = other.Max;
                String formattedString = String.format("%s มีน้ำ %d/%d : %s มีน้ำ %d/%d ***%s เติมน้ำให้ %s*** จำนวน %d ",Name,Current,Max,other.Name,CurrentWater,other.Max,Name,other.Name,water);
                System.out.println(formattedString);
                if (Current >= water){
                    Current-=water;
                }
                System.out.println(Name+" น้ำปัจจุบัน " +Current+"/"+Max);
                System.out.println(other.Name+" น้ำเหลือ "+other.Current+"/"+other.Max);
                System.out.println(other.Name+" จำนวนที่เกิน " +Math.abs(left));
            }
        }
        else if(other.Current < water){
            System.out.println(Name+ " น้ำไม่พอให้เทไป "+other.Name);
        }System.out.println(" ");
        
    }
    public void PourFloor(int water){
        if(Current >= water){
            Current -= water;
            System.out.println(Name+" เทน้ำทิ้ง " +water);
            System.out.println(Name+" น้ำปัจจุบัน " +Current+"/"+Max);
        }else {
            System.out.println(Name+" น้ำไม่พอให้เททิ้ง ");
        }System.out.println(" ");
        
    }
    public void PourFloorMax(){
        Current = 0;
        System.out.println(Name+" เทน้ำทิ้งจนหมด " );
        System.out.println(Name+" น้ำปัจจุบัน " +Current+"/"+Max);
        System.out.println(" ");
    }
}
