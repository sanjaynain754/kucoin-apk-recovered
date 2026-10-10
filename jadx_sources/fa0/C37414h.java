package fa0;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.ArrayList;

/* JADX INFO: renamed from: fa0.h */
/* JADX INFO: compiled from: AsyncStorageExpoMigration.java */
/* JADX INFO: loaded from: classes59.dex */
public class C37414h {
    /* JADX INFO: renamed from: a */
    public static void m84156a(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws Throwable {
        Throwable th2;
        FileChannel channel;
        FileChannel fileChannel = null;
        try {
            FileChannel channel2 = fileInputStream.getChannel();
            try {
                channel = fileOutputStream.getChannel();
                try {
                    channel2.transferTo(0L, channel2.size(), channel);
                    try {
                        channel2.close();
                    } finally {
                        if (channel != null) {
                            channel.close();
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    fileChannel = channel2;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } finally {
                            if (channel != null) {
                                channel.close();
                            }
                        }
                    }
                    if (channel == null) {
                        throw th2;
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                channel = null;
            }
        } catch (Throwable th5) {
            th2 = th5;
            channel = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList<File> m84157b(Context context) {
        ArrayList<File> arrayList = new ArrayList<>();
        try {
            File[] fileArrListFiles = context.getDatabasePath("noop").getParentFile().listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.getName().startsWith("RKStorage-scoped-experience-") && !file.getName().endsWith("-journal")) {
                        arrayList.add(file);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static long m84160e(File file) {
        try {
            return Build.VERSION.SDK_INT >= 26 ? m84159d(file) : file.lastModified();
        } catch (Exception e11) {
            e11.printStackTrace();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m84161f(Context context) {
        return context.getDatabasePath("RKStorage").exists();
    }

    /* JADX INFO: renamed from: c */
    public static File m84158c(ArrayList<File> arrayList) {
        File file = null;
        if (arrayList.size() == 0) {
            return null;
        }
        long j11 = -1;
        for (File file2 : arrayList) {
            long jM84160e = m84160e(file2);
            if (jM84160e > j11) {
                file = file2;
                j11 = jM84160e;
            }
        }
        if (file != null) {
            return file;
        }
        return arrayList.get(0);
    }

    @RequiresApi(26)
    /* JADX INFO: renamed from: d */
    public static long m84159d(File file) {
        try {
            return Files.readAttributes(file.toPath(), C37410d.m84152a(), new LinkOption[0]).creationTime().toMillis();
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m84162g(Context context) throws Throwable {
        if (m84161f(context)) {
            return;
        }
        ArrayList<File> arrayListM84157b = m84157b(context);
        File fileM84158c = m84158c(arrayListM84157b);
        if (fileM84158c == null) {
            Log.v("AsyncStorageExpoMigration", "No scoped database found");
            return;
        }
        try {
            C37417k.m84163j(context).m84168i();
            m84156a(new FileInputStream(fileM84158c), new FileOutputStream(context.getDatabasePath("RKStorage")));
            Log.v("AsyncStorageExpoMigration", "Migrated most recently modified database " + fileM84158c.getName() + " to RKStorage");
            try {
                for (File file : arrayListM84157b) {
                    if (file.delete()) {
                        Log.v("AsyncStorageExpoMigration", "Deleted scoped database " + file.getName());
                    } else {
                        Log.v("AsyncStorageExpoMigration", "Failed to delete scoped database " + file.getName());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            Log.v("AsyncStorageExpoMigration", "Completed the scoped AsyncStorage migration");
        } catch (Exception e12) {
            Log.v("AsyncStorageExpoMigration", "Failed to migrate scoped database " + fileM84158c.getName());
            e12.printStackTrace();
        }
    }
}
