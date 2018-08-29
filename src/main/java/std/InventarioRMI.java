package std;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;


public interface InventarioRMI extends Remote{

    public void add(char ap, char mac, ArrayList freq, char local) throws RemoteException;
    public ArrayList list() throws RemoteException;
    public ArrayList list_freq(ArrayList freq) throws RemoteException;
    public void del(char ap) throws RemoteException;

}