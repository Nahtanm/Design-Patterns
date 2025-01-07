package br.com.nahtanm.observer;

public class JornalLocal implements Observador{
    @Override
    public void ultimasNoticias(Assunto assunto) {
        if (assunto instanceof Noticia){
            Noticia noticia = (Noticia) assunto;
            System.out.println("Notificado pelo jornal local de outra cidade " + noticia.toString());

        }
    }
}
