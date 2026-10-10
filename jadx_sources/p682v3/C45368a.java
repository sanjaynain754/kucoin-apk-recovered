package p682v3;

import java.io.File;

/* JADX INFO: renamed from: v3.a */
/* JADX INFO: compiled from: FileTree.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45368a {
    /* JADX INFO: renamed from: a */
    public static boolean m100268a(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zM100269b = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                zM100269b &= m100269b(file2);
            }
        }
        return zM100269b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m100269b(File file) {
        if (file.isDirectory()) {
            m100268a(file);
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: c */
    public static void m100270c(File file, InterfaceC45369b interfaceC45369b) {
        interfaceC45369b.mo8485c(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m100270c(file2, interfaceC45369b);
                } else {
                    interfaceC45369b.mo8483a(file2);
                }
            }
        }
        interfaceC45369b.mo8484b(file);
    }
}
