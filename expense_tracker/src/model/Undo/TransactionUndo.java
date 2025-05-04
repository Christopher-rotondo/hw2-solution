package model.Undo;

import java.util.List;

import model.Transaction;

public interface TransactionUndo {

    public List<Transaction> undo(List<Transaction> transactions);
    
}
