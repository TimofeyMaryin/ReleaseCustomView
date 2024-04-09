Для того, чтоб при повороте экрана веб вью сохраняло свое состояние добавте в Ваше активте следующую строчку:

****<activity
  ...
  android:configChanges="keyboardHidden|orientation|screenSize"
  ... 
/>****
