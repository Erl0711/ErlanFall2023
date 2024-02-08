package com.fall23.ui.helper;

import com.fall23.ui.drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.Set;

public class WindowHelper {

    //Возращает список всех открытых вкладок
    public  Set<String> getWindowHandles (){
        return Driver.getDriver().getWindowHandles();
    }

    //
    public  void switchToWindow(int index){
        // Выбрали линкедлист так как порядоку будет таким каким мы его укажем
        LinkedList<String> windowsID = new LinkedList<>(
                getWindowHandles()
        );
        // Мы не можем указывать негативное значение
        //                       количество откр вкл
        if (index < 0 || index > windowsID.size()){
            // из-за этого указали предупреждение
            throw new IllegalArgumentException("You provide wrong Index" + index);
        }
        // Если все ок,то переключится в окошко под указанным индексом
       Driver.getDriver().switchTo().window(windowsID.get(index));
    }

   public void swichToParent(){
        LinkedList<String> windowsId = new LinkedList<>(
                getWindowHandles()
        );
        Driver.getDriver().switchTo().window(windowsId.get(0));
   }

   public void switchToParentWithChildClose(){
        swichToParent();
        LinkedList<String> windowsId = new LinkedList<>(
                getWindowHandles()
        );

       for (int i = 1; i < windowsId.size(); i++){
           Driver.getDriver().switchTo().window(windowsId.get(i));
           Driver.getDriver().close();
       }
       swichToParent();
   }

}
