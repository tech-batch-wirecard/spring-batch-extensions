package org.springframework.batch.item.excel;

public interface SheetOpenListener {

    void onSheetOpen(int sheetIndex, String sheetName);
}
