# Test Case: Register successfully
## Second stage: Challenge automation - GREat

### Machine Applications
- Ubuntu 20.20 Linux 5.4.0-31-generic
- OpenJDK 14.0.1-7.1ubuntu1
- Maven 3.6.3-1  
- Firefox-geckodriver 76.0
- Eclipse 2020-03 (4.15.0)
- JUnit 5.6.0
- Selenium 4.0.0-alpha-3

### Run
- Search and install machine applications;
- Import the project;
- Run Junit.

### Test cases
01. Access the URL _https://www.organizze.com.br_;
02. Click on _Cadastre-se_;
03. Select _Organizar as minhas Finanças_ option;
04. Fill in random _email_;
05. Fill in _password_;
06. Fill in _password_ confirmation;
07. Check the _Li e concordo com os termos de uso_ option;
08. Click on _Começar a usar_.

### Asserts
01. AssertText: Ok, começar agora;
02. AssertText:  Parabéns! O Organizze já está preparado para você!;
03. AssertText: Enviamos um e-mail para sua caixa de entrada. Confirme seu cadastro para receber um e-mail importante da nossa equipe.

### Demo
https://www.loom.com/share/660a385ef5554354838ab62e76d956e0x-special/nautilus-clipboard