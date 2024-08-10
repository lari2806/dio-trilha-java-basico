```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(musica : String)

    }

    class AparelhoTelefonico {
        +ligar(numero:String)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina( url : String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        +ligar(numero:String)
        +atender()
        +iniciarCorreioVoz()
        +tocar()
        +pausar()P
        +selecionarMusica(musica : String)
         +exibirPagina( url : String)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
