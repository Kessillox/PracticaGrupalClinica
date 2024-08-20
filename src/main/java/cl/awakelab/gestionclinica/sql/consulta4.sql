SELECT
d.Nombre AS Doctor,
p.Nombre AS Paciente
FROM
    Citas c
JOIN Doctores d ON c.Doctor_ID = d.ID
JOIN Pacientes p ON c.Paciente_ID = p.ID
ORDER BY
    d.Nombre, p.Nombre;