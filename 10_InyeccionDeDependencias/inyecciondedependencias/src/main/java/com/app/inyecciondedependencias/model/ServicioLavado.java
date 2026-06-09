package com.app.inyecciondedependencias.model;

public class ServicioLavado {
    
    private ServicioLavadoNormal servicioLavadoNormal;
    private ServicioLavadoPremium servicioLavadoPremium;

    /**
     * Inyeccion de dependencias mediante constructores
     * Se puede usar la Notation @AllArgsConstructor de Lombok
     * @param servicioLavadoNormal
     * @param servicioLavadoPremium 
     */
    public ServicioLavado(ServicioLavadoNormal servicioLavadoNormal, ServicioLavadoPremium servicioLavadoPremium) {
        this.servicioLavadoNormal = servicioLavadoNormal;
        this.servicioLavadoPremium = servicioLavadoPremium;
    }

    /**
     * Inyeccion de dependencias mediante Setters
     * Se puede sustituir con el uso de la Notation @Setter de Lombok
     */
    
    public void setServicioLavadoNormal(ServicioLavadoNormal servicioLavadoNormal) {
        this.servicioLavadoNormal = servicioLavadoNormal;
    }
    
    public void setServicioLavadoPremium(ServicioLavadoPremium servicioLavadoPremium) {
        this.servicioLavadoPremium = servicioLavadoPremium;
    }
    
}
