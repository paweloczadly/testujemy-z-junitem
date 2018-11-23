# testujemy-z-junitem

Repozytorium przeznaczone do nauki JUnit oraz Selenium.

## Jak zacząć

Zakładamy, że użytkownik korzystający z tego repozytorium używa systemu Mac OS X. Na początku należy otworzyć aplikację **Terminal** i śćiągnąć projekt:

```
git clone https://github.com/paweloczadly/testujemy-z-junitem.git
```

Po ściągnięciu repozytorium należy zainstalować poniższe oprogramowanie:

* [IntelliJ IDEA Community edition](https://www.jetbrains.com/idea/download/#section=mac) - w tym programie będziemy pisać kod źródłowy.
* [sdkman](https://sdkman.io/install) - pozwala na łatwe zarządzanie maszyną wirtualną Javy i wersją Mavena. Instalacja wygląda następująco:
  * Otwieramy terminal.
  * Wpisujemy: `curl -s "https://get.sdkman.io" | bash`
  * Wpisujemy: `source "$HOME/.sdkman/bin/sdkman-init.sh"`
  * Wpisujemy: `sdk install java`
  * Wpisujemy: `sdk install maven`
* [ChromeDriver]() - uruchomi przeglądarkę Chrome, w której będę działać testy automatyczne. Instalacja: `brew cask install chromedriver`