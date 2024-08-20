SELECT Historia_Clinica.Diagnostico,
       COUNT(Historia_Clinica.Diagnostico) AS Frecuencia
FROM
    Historia_Clinica
GROUP BY
    Diagnostico
ORDER BY
    Frecuencia;