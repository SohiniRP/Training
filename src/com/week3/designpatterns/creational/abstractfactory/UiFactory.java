package com.week3.designpatterns.creational.abstractfactory;

import java.awt.*;

public interface UiFactory {

    Button createButton();
    Checkbox createCheckbox();
}
