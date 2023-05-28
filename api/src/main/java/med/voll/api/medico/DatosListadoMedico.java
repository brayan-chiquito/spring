package med.voll.api.medico;

public record DatosListadoMedico(Long id, String nombre, String Especialidad, String Docuemnto, String Email) {
    public DatosListadoMedico(Medico medico){
        this(medico.getId(), medico.getNombre(), medico.getEspecialidad().toString(), medico.getDocumento(), medico.getEmail());
    }
}
