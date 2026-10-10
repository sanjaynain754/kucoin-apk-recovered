package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p628t1.InterfaceC44610b;

/* JADX INFO: loaded from: classes.dex */
public final class GlideException extends Exception {

    /* JADX INFO: renamed from: b */
    public static final StackTraceElement[] f6819b = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;

    @Nullable
    private Exception exception;
    private InterfaceC44610b key;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.GlideException$a */
    /* JADX INFO: loaded from: classes34.dex */
    public static final class C5340a implements Appendable {

        /* JADX INFO: renamed from: b */
        public final Appendable f6820b;

        /* JADX INFO: renamed from: c */
        public boolean f6821c = true;

        @Override // java.lang.Appendable
        public Appendable append(char c11) throws IOException {
            if (this.f6821c) {
                this.f6821c = false;
                this.f6820b.append("  ");
            }
            this.f6821c = c11 == '\n';
            this.f6820b.append(c11);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public final CharSequence m6745a(@Nullable CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public C5340a(Appendable appendable) {
            this.f6820b = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence) throws IOException {
            CharSequence charSequenceM6745a = m6745a(charSequence);
            return append(charSequenceM6745a, 0, charSequenceM6745a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(@Nullable CharSequence charSequence, int i11, int i12) throws IOException {
            CharSequence charSequenceM6745a = m6745a(charSequence);
            boolean z11 = false;
            if (this.f6821c) {
                this.f6821c = false;
                this.f6820b.append("  ");
            }
            if (charSequenceM6745a.length() > 0 && charSequenceM6745a.charAt(i12 - 1) == '\n') {
                z11 = true;
            }
            this.f6821c = z11;
            this.f6820b.append(charSequenceM6745a, i11, i12);
            return this;
        }
    }

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.EMPTY_LIST);
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void setLoggingDetails(InterfaceC44610b interfaceC44610b, DataSource dataSource) {
        setLoggingDetails(interfaceC44610b, dataSource, null);
    }

    public GlideException(String str, Throwable th2) {
        this(str, (List<Throwable>) Collections.singletonList(th2));
    }

    /* JADX INFO: renamed from: a */
    public final void m6743a(Throwable th2, List<Throwable> list) {
        if (!(th2 instanceof GlideException)) {
            list.add(th2);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th2).getCauses().iterator();
        while (it.hasNext()) {
            m6743a(it.next(), list);
        }
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.detailMessage);
        sb2.append(this.dataClass != null ? ", " + this.dataClass : "");
        sb2.append(this.dataSource != null ? ", " + this.dataSource : "");
        sb2.append(this.key != null ? ", " + this.key : "");
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb2.toString();
        }
        if (rootCauses.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(rootCauses.size());
            sb2.append(" root causes:");
        }
        for (Throwable th2 : rootCauses) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Nullable
    public Exception getOrigin() {
        return this.exception;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        m6743a(this, arrayList);
        return arrayList;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m6744e(printStream);
    }

    public void setLoggingDetails(InterfaceC44610b interfaceC44610b, DataSource dataSource, Class<?> cls) {
        this.key = interfaceC44610b;
        this.dataSource = dataSource;
        this.dataClass = cls;
    }

    public void setOrigin(@Nullable Exception exc) {
        this.exception = exc;
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(f6819b);
        this.causes = list;
    }

    /* JADX INFO: renamed from: b */
    public static void m6740b(List<Throwable> list, Appendable appendable) {
        try {
            m6741c(list, appendable);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m6741c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            appendable.append("Cause (").append(String.valueOf(i12)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = list.get(i11);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).m6744e(appendable);
            } else {
                m6742d(th2, appendable);
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m6742d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6744e(Appendable appendable) {
        m6742d(this, appendable);
        m6740b(getCauses(), new C5340a(appendable));
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i11 = 0;
        while (i11 < size) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Root cause (");
            int i12 = i11 + 1;
            sb2.append(i12);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i(str, sb2.toString(), rootCauses.get(i11));
            i11 = i12;
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m6744e(printWriter);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
