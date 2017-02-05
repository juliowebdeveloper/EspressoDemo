package br.com.espressodemo;

import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Shido on 29/01/2017.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest  {
    //Criando uma nova regra para essa MainActivityTest baseado na ActivityRule do jake wharton
    //Com isso não precisa extender a ActivityInstrumentationBarfCase2
    @Rule public final ActivityRule<MainActivity> main = new ActivityRule<>(MainActivity.class);

    @Test
    public void shouldBeAbleToLaunchMainScreen(){
         //TDD - escrevendo o test primeiro, depois indo para implementação
        //Depois de achar a view - depois de olhar o texto o que é esperado
        onView(withText("Hello")).check(ViewAssertions.matches(isDisplayed()));
        //Procurando por uma view que tenha o texto hello

    }

}
