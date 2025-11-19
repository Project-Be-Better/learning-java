package org.xploretown.templateMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InventoryReport extends ReportGenerator{
    @Override
    protected void printBody() {
        log.info("printing Body from Inventory Report");
    }
}
