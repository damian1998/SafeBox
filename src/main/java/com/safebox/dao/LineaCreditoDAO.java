package com.safebox.dao;

import com.safebox.entidades.LineaCredito;

public interface LineaCreditoDAO extends GenericDAO<LineaCredito, Integer> {
public abstract LineaCredito verInformacion(String nombre);

}
