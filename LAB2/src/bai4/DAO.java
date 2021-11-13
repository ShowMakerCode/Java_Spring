/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;

/**
 *
 * @author 98tae
 */
public interface DAO {

    public void Insert(Usermanagent userr);

    public void Update(int Location, Usermanagent userr);

    public void Delete(int Location);

    public void Select();

    public ArrayList<Usermanagent> getList();

    public void setlist(ArrayList<Usermanagent> list);

}
