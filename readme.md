# 001_Tutorial_button_click_toast

## Purpose
Tutorial: show toast message upon button click

2016.10.02 by Szőke Sándor
Android Studio version: 2.2 (September 15, 2016)

## Steps needed
* create application
* drag button onto layout
* add code to: class MainActivity 

```java
    public void buttonOnClick(View v)
    {
        Button button = (Button) v;
        ((Button) v).setText("Toast was displayed!");
        Toast.makeText(MainActivity.this, "Toast message :)",Toast.LENGTH_LONG).show();
    }
```
* attach code to button onClick: buttonOnClick
* place cursor after "(View v)" and press ALT+ENTER to extentend includes
* place cursor after "(Button)" and press ALT+ENTER to extentend includes
* exetute and click
