package nh0;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import oh0.C43091a;
import org.jsoup.UncheckedIOException;
import org.jsoup.nodes.AbstractC43189g;
import org.jsoup.nodes.C43186d;
import org.jsoup.nodes.C43193k;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.C43299e;

/* JADX INFO: renamed from: nh0.a */
/* JADX INFO: compiled from: DataUtil.java */
/* JADX INFO: loaded from: classes61.dex */
public final class C42840a {

    /* JADX INFO: renamed from: a */
    public static final Pattern f94900a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");

    /* JADX INFO: renamed from: b */
    public static final char[] f94901b = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* JADX INFO: renamed from: nh0.a$a */
    /* JADX INFO: compiled from: DataUtil.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final String f94902a;

        /* JADX INFO: renamed from: b */
        public final boolean f94903b;

        public a(String str, boolean z11) {
            this.f94902a = str;
            this.f94903b = z11;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m93942b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f94900a.matcher(str);
        if (matcher.find()) {
            return m93946f(matcher.group(1).trim().replace("charset=", ""));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static String m93946f(String str) {
        if (str != null && str.length() != 0) {
            String strReplaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(strReplaceAll)) {
                    return strReplaceAll;
                }
                String upperCase = strReplaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX INFO: renamed from: d */
    public static Document m93944d(InputStream inputStream, String str, String str2, C43299e c43299e) throws IOException {
        C43193k c43193kM94957c0;
        if (inputStream == null) {
            return new Document(str2);
        }
        C43091a c43091aM94676g = C43091a.m94676g(inputStream, 32768, 0);
        c43091aM94676g.mark(32768);
        ByteBuffer byteBufferM93945e = m93945e(c43091aM94676g, 5119);
        boolean z11 = c43091aM94676g.read() == -1;
        c43091aM94676g.reset();
        a aVarM93941a = m93941a(byteBufferM93945e);
        String strReplaceAll = aVarM93941a != null ? aVarM93941a.f94902a : str;
        Document documentM95193d = null;
        if (strReplaceAll == null) {
            try {
                CharBuffer charBufferDecode = Charset.forName("UTF-8").decode(byteBufferM93945e);
                Document documentM95193d2 = charBufferDecode.hasArray() ? c43299e.m95193d(new CharArrayReader(charBufferDecode.array()), str2) : c43299e.m95194e(charBufferDecode.toString(), str2);
                String strMo94960f = null;
                for (Element element : documentM95193d2.m94865Y0("meta[http-equiv=content-type], meta[charset]")) {
                    if (element.mo94962v("http-equiv")) {
                        strMo94960f = m93942b(element.mo94960f("content"));
                    }
                    if (strMo94960f == null && element.mo94962v("charset")) {
                        strMo94960f = element.mo94960f("charset");
                    }
                    if (strMo94960f != null) {
                        break;
                    }
                }
                if (strMo94960f == null && documentM95193d2.mo94887m() > 0) {
                    AbstractC43189g abstractC43189gM94993l = documentM95193d2.m94993l(0);
                    if (abstractC43189gM94993l instanceof C43193k) {
                        c43193kM94957c0 = (C43193k) abstractC43189gM94993l;
                    } else if (abstractC43189gM94993l instanceof C43186d) {
                        C43186d c43186d = (C43186d) abstractC43189gM94993l;
                        if (c43186d.m94961f0()) {
                            c43193kM94957c0 = c43186d.m94957c0();
                        } else {
                            c43193kM94957c0 = null;
                        }
                    } else {
                        c43193kM94957c0 = null;
                    }
                    if (c43193kM94957c0 != null && c43193kM94957c0.m95007e0().equalsIgnoreCase("xml")) {
                        strMo94960f = c43193kM94957c0.mo94960f("encoding");
                    }
                }
                String strM93946f = m93946f(strMo94960f);
                if (strM93946f != null && !strM93946f.equalsIgnoreCase("UTF-8")) {
                    strReplaceAll = strM93946f.trim().replaceAll("[\"']", "");
                } else if (z11) {
                    documentM95193d = documentM95193d2;
                }
            } catch (UncheckedIOException e11) {
                throw e11.ioException();
            }
        } else {
            C42841b.m93956h(strReplaceAll, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
        }
        if (documentM95193d == null) {
            if (strReplaceAll == null) {
                strReplaceAll = "UTF-8";
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c43091aM94676g, strReplaceAll), 32768);
            if (aVarM93941a != null && aVarM93941a.f94903b) {
                C42841b.m93951c(bufferedReader.skip(1L) == 1);
            }
            try {
                documentM95193d = c43299e.m95193d(bufferedReader, str2);
                Charset charsetForName = Charset.forName(strReplaceAll);
                documentM95193d.m94813s1().m94821c(charsetForName);
                if (!charsetForName.canEncode()) {
                    documentM95193d.m94806n1(Charset.forName("UTF-8"));
                }
            } catch (UncheckedIOException e12) {
                throw e12.ioException();
            }
        }
        c43091aM94676g.close();
        return documentM95193d;
    }

    /* JADX INFO: renamed from: e */
    public static ByteBuffer m93945e(InputStream inputStream, int i11) throws IOException {
        C42841b.m93952d(i11 >= 0, "maxSize must be 0 (unlimited) or larger");
        return C43091a.m94676g(inputStream, 32768, i11).m94678b(i11);
    }

    /* JADX INFO: renamed from: a */
    public static a m93941a(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        byte[] bArr = new byte[4];
        if (byteBuffer.remaining() >= 4) {
            byteBuffer.get(bArr);
            byteBuffer.rewind();
        }
        byte b11 = bArr[0];
        if ((b11 == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (b11 == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            return new a("UTF-32", false);
        }
        if ((b11 == -2 && bArr[1] == -1) || (b11 == -1 && bArr[1] == -2)) {
            return new a("UTF-16", false);
        }
        if (b11 == -17 && bArr[1] == -69 && bArr[2] == -65) {
            return new a("UTF-8", true);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static Document m93943c(InputStream inputStream, String str, String str2) throws IOException {
        return m93944d(inputStream, str, str2, C43299e.m95189b());
    }
}
