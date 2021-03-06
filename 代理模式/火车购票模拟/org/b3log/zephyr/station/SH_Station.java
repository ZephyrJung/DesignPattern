package org.b3log.zephyr.station;

import org.b3log.zephyr.ticket.Ticket;
import org.b3log.zephyr.ticket.TicketSeller;

/**
 * Created by Zephyr on 2017/1/6.
 */
public class SH_Station extends Station implements TicketSeller {
    public SH_Station(){
        super();
        this.start="上海";
    }

    @Override
    public Ticket buyTicket(String end) {
        switch(end){
            case "BJ":return toBeiJing();
            case "ZZ":return toZhengZhou();
        }
        return null;
    }

    private Ticket toBeiJing(){
        return new Ticket(start,"北京","2016-1-5","550");
    }
    private Ticket toZhengZhou(){
        return new Ticket(start,"郑州","2016-1-6","270");
    }
}
