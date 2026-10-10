package wh0;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: wh0.n */
/* JADX INFO: compiled from: StreamUtils.java */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC45846n {

    /* JADX INFO: renamed from: a */
    public static final byte[] f103317a = new byte[0];

    /* JADX INFO: renamed from: a */
    public static String m101264a(ByteArrayOutputStream byteArrayOutputStream, Charset charset) {
        AbstractC45833a.m101250a(byteArrayOutputStream, "No ByteArrayOutputStream specified");
        AbstractC45833a.m101250a(charset, "No Charset specified");
        try {
            return byteArrayOutputStream.toString(charset.name());
        } catch (UnsupportedEncodingException e11) {
            throw new IllegalArgumentException("Invalid charset name: " + charset, e11);
        }
    }
}
