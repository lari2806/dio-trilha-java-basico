```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar(): void
        +pausar(): void
        +selecionarMusica(musica : String): void

    }

    class AparelhoTelefonico {
        +ligar(numero:String):void
        +atender():void
        +iniciarCorreioVoz():void
    }

    class NavegadorInternet {
        +exibirPagina( url : String)
        +adicionarNovaAba():void
        +atualizarPagina():void
    }

    class iPhone {
        +ligar(numero:String):void
        +atender():void
        +iniciarCorreioVoz():void
        +tocar(): void
        +pausar(): void
        +selecionarMusica(musica : String): void
         +exibirPagina( url : String)
        +adicionarNovaAba():void
        +atualizarPagina():void
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
