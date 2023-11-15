public class Usuario {
    private String usuario;
    private int password;
    
    public Usuario() {
        this.usuario = "";
        this.password = 0;
    }

    public Usuario(String usuario, int password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    
    
    public boolean validarPassword(int contra) {
        return this.password == contra;
    }

    public void cambioPassword(String newPass) {
        try {
            int nuevaContraseña = Integer.parseInt(newPass);
            this.password = nuevaContraseña;
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir la nueva contraseña a entero");
        }
    }

    public void delay(int mili) {
        try {
            Thread.sleep(mili);
        } catch (InterruptedException e) {
            System.out.println("Delay de " + mili + " milisegundos");
        }
    }

    public boolean usuariosDiferentes(Usuario u2) {
        return !this.equals(u2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Usuario usuario = (Usuario) obj;
        return this.usuario.equals(usuario.usuario) && this.password == usuario.password;
    }    
}
