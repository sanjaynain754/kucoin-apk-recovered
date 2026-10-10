package oc0;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* JADX INFO: renamed from: oc0.d */
/* JADX INFO: compiled from: NetworkUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C43017d {
    /* JADX INFO: renamed from: b */
    public static boolean m94488b(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                String[] strArrSplit = str.split("\\.");
                if (strArrSplit.length != 4) {
                    return false;
                }
                for (String str2 : strArrSplit) {
                    int i11 = Integer.parseInt(str2);
                    if (i11 < 0 || i11 > 255) {
                        return false;
                    }
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static String m94487a() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.isUp()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if (!inetAddressNextElement.isLinkLocalAddress() && inetAddressNextElement.getHostAddress() != null) {
                            String hostAddress = inetAddressNextElement.getHostAddress();
                            if (!hostAddress.equals("127.0.0.1") && m94488b(hostAddress)) {
                                return hostAddress;
                            }
                        }
                    }
                }
            }
            return null;
        } catch (SocketException unused) {
            return null;
        }
    }
}
