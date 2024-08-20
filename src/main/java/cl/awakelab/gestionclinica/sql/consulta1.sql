SELECT p.nombre
FROM Pacientes p
JOIN Historia_Clinica hc ON p.ID = hc.Paciente_ID
JOIN Doctores d ON hc.Doctor_ID = d.ID
JOIN Especialidades e ON d.Especialidad_ID = e.ID
WHERE e.Nombre = "Neurología";


SELECT p.nombre
FROM Pacientes p
         JOIN citas c ON p.ID = c.Paciente_ID
         JOIN Doctores d ON c.Doctor_ID = d.ID
         JOIN Especialidades e ON d.Especialidad_ID = e.ID
WHERE e.Nombre = "Neurología";


