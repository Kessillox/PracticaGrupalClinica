SELECT
    a.Nombre,
    SUM(d.Monto) / COUNT(d.ID) AS Promedio
FROM Especialidades a
    INNER JOIN Doctores b ON b.Especialidad_ID = a.ID
    INNER JOIN Citas c ON c.Doctor_ID = b.ID
    INNER JOIN Facturas d ON d.ID = c.Factura_ID
GROUP BY
    a.Nombre
ORDER BY
    a.Nombre ASC;

SELECT
    a.Nombre,
    SUM(f.Monto) / COUNT(f.ID) AS Promedio,
    avg((f.Monto))
FROM Especialidades a
    INNER JOIN Doctores b ON b.Especialidad_ID = a.ID
    INNER JOIN Historia_Clinica c ON c.Doctor_ID = b.ID
    INNER JOIN Pacientes d ON d.ID = c.Paciente_ID
    INNER JOIN Citas e ON e.Paciente_ID = d.ID
    INNER JOIN Facturas f ON f.ID = e.Factura_ID
GROUP BY
    a.Nombre
ORDER BY
    a.Nombre ASC;
