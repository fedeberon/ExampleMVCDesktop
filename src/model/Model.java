package model;

import beans.Constants;

import javax.swing.table.DefaultTableModel;

/**
 * Created by Damian on 10/05/2018.
 */
public class Model extends DefaultTableModel {

    public Model() {
        super(Constants.DATA, Constants.TABLE_HEADER);
    }


}
