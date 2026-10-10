package jumio.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.jumio.commons.log.Log;
import com.tencent.bugly.proguard.C33844oi;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.p407io.ConsoleKt;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: jumio.core.q3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40716q3 {
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX INFO: renamed from: a */
    public static boolean m89265a(Context context) {
        String[] strArr;
        Process processExec;
        Throwable th2;
        boolean z11;
        List<String> listSplit;
        List listEmptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        String[] strArr2 = AbstractC40721r3.f90383a;
        PackageManager packageManager = context.getPackageManager();
        for (String str : strArr2) {
            try {
                packageManager.getPackageInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException e11) {
                Log.m14467e(e11.toString());
            }
        }
        String[] strArr3 = AbstractC40721r3.f90384b;
        PackageManager packageManager2 = context.getPackageManager();
        for (String str2 : strArr3) {
            try {
                packageManager2.getPackageInfo(str2, 0);
                return true;
            } catch (PackageManager.NameNotFoundException e12) {
                Log.m14467e(e12.toString());
            }
        }
        String str3 = AbstractC40721r3.f90386d;
        String str4 = System.getenv(AbstractC40721r3.f90390h);
        if (str4 == null || (listSplit = new Regex(C33844oi.f71346o).split(str4, 0)) == null) {
            strArr = new String[0];
        } else {
            if (listSplit.isEmpty()) {
                listEmptyList = CollectionsKt.emptyList();
                break;
            }
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listEmptyList = CollectionsKt.emptyList();
                    break;
                }
                if (listIterator.previous().length() != 0) {
                    listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
            if (listEmptyList == null || (strArr = (String[]) listEmptyList.toArray(new String[0])) == null) {
                strArr = new String[0];
            }
        }
        boolean zExists = false;
        for (String str5 : strArr) {
            zExists |= new File(str5 + File.separator + str3).exists();
        }
        if (!zExists) {
            try {
                processExec = Runtime.getRuntime().exec(new String[]{AbstractC40721r3.f90387e, AbstractC40721r3.f90386d});
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                    try {
                        z11 = ConsoleKt.readLine() != null;
                        CloseableKt.closeFinally(bufferedReader, null);
                        try {
                            processExec.destroy();
                        } catch (Exception e13) {
                            Log.m14467e("Binary check failed with " + e13);
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            CloseableKt.closeFinally(bufferedReader, th3);
                            throw th4;
                        }
                    }
                } catch (Exception unused) {
                    if (processExec != null) {
                        try {
                            processExec.destroy();
                        } catch (Exception e14) {
                            Log.m14467e("Binary check failed with " + e14);
                        }
                    }
                    z11 = false;
                } catch (Throwable th5) {
                    th2 = th5;
                    if (processExec != null) {
                        try {
                            processExec.destroy();
                        } catch (Exception e15) {
                            Log.m14467e("Binary check failed with " + e15);
                        }
                    }
                    throw th2;
                }
            } catch (Exception unused2) {
                processExec = null;
            } catch (Throwable th6) {
                processExec = null;
                th2 = th6;
            }
            if (!z11 && !m89266a(AbstractC40721r3.f90385c)) {
                String TAGS = Build.TAGS;
                if (TAGS == null) {
                    return false;
                }
                Intrinsics.checkNotNullExpressionValue(TAGS, "TAGS");
                if (!StringsKt.contains$default((CharSequence) TAGS, (CharSequence) AbstractC40721r3.f90389g, false, 2, (Object) null)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m89266a(Map props) throws Throwable {
        Intrinsics.checkNotNullParameter(props, "props");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\\[(");
        Iterator it = props.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append("|");
        }
        boolean z11 = true;
        sb2.deleteCharAt(sb2.length() - 1);
        sb2.append(")\\]: \\[(.*)\\]");
        Pattern patternCompile = Pattern.compile(sb2.toString());
        Process process = null;
        boolean z12 = false;
        try {
            try {
                Process processExec = Runtime.getRuntime().exec(AbstractC40721r3.f90388f);
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                        String str = "";
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line != null) {
                                    str = line;
                                } else {
                                    line = null;
                                }
                                if (line == null) {
                                    z11 = false;
                                    break;
                                }
                                Matcher matcher = patternCompile.matcher(str);
                                if (matcher.find()) {
                                    String strGroup = matcher.group(1);
                                    if (strGroup == null) {
                                        strGroup = "";
                                    }
                                    if (Intrinsics.areEqual(props.get(strGroup), matcher.group(2))) {
                                        break;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        try {
                            Unit unit = Unit.INSTANCE;
                            try {
                                CloseableKt.closeFinally(bufferedReader, null);
                                try {
                                    processExec.destroy();
                                    return z11;
                                } catch (Exception e11) {
                                    Log.m14467e("Closing props check failed with " + e11);
                                    return z11;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                z12 = z11;
                                process = processExec;
                                Log.m14467e("Props check failed with " + e);
                                if (process != null) {
                                    try {
                                        process.destroy();
                                    } catch (Exception e13) {
                                        Log.m14467e("Closing props check failed with " + e13);
                                    }
                                }
                                return z12;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z12 = z11;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                CloseableKt.closeFinally(bufferedReader, th);
                                throw th4;
                            }
                        }
                    } catch (Exception e14) {
                        e = e14;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    process = processExec;
                    if (process != null) {
                        try {
                            process.destroy();
                        } catch (Exception e15) {
                            Log.m14467e("Closing props check failed with " + e15);
                        }
                    }
                    throw th;
                }
            } catch (Exception e16) {
                e = e16;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
