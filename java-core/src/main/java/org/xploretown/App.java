package org.xploretown;

import org.xploretown.abstractClasses.AnimalKingdom;
import org.xploretown.generics.Box;
import org.xploretown.generics.Container;
import org.xploretown.templateMethod.InventoryReport;
import org.xploretown.templateMethod.SalesReport;

public class App
{
    public static void main( String[] args )
    {
        Box.execute();
        Container.execute();
        AnimalKingdom.execute();

        SalesReport salesReport = new SalesReport();
        salesReport.generateReport();

        InventoryReport inventoryReport = new InventoryReport();
        inventoryReport.generateReport();
    }
}
