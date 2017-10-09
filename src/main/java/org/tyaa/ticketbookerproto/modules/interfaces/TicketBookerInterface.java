/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.ticketbookerproto.modules.interfaces;

import java.util.Date;

/**
 *
 * @author yurii
 */
public interface TicketBookerInterface {
    
    /**
     * Заказать билет на основании подготовленных данных.Вызывается из клиентского кода
     * @param sender - ссылка на объект, вызывающий реализацию метода
     */
    void bookTicket(
            Object sender
            , String from
            , String to
            , Date date
            , int pos
            , String trainNumber
            , String carType
            , String carNumber
            , int seatNumber
    );
}
