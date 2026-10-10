package f90;

import com.meituan.android.walle.SignatureNotFoundException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: f90.e */
/* JADX INFO: compiled from: PayloadReader.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C37404e {
    /* JADX INFO: renamed from: b */
    public static Map<Integer, ByteBuffer> m84132b(File file) {
        FileChannel channel;
        RandomAccessFile randomAccessFile;
        Map<Integer, ByteBuffer> mapM84121f = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    channel = randomAccessFile.getChannel();
                    try {
                        mapM84121f = C37400a.m84121f(C37400a.m84117b(channel).m84130a());
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException unused2) {
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile != null) {
                        }
                        return mapM84121f;
                    } catch (Throwable th2) {
                        th = th2;
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (randomAccessFile == null) {
                            throw th;
                        }
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (IOException unused5) {
                            throw th;
                        }
                    }
                } catch (IOException unused6) {
                    channel = null;
                } catch (Throwable th3) {
                    th = th3;
                    channel = null;
                }
            } catch (SignatureNotFoundException | IOException unused7) {
            }
        } catch (IOException unused8) {
            channel = null;
            randomAccessFile = null;
        } catch (Throwable th4) {
            th = th4;
            channel = null;
            randomAccessFile = null;
        }
        randomAccessFile.close();
        return mapM84121f;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m84131a(File file, int i11) {
        ByteBuffer byteBuffer;
        Map<Integer, ByteBuffer> mapM84132b = m84132b(file);
        if (mapM84132b == null || (byteBuffer = mapM84132b.get(Integer.valueOf(i11))) == null) {
            return null;
        }
        return m84133c(byteBuffer);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m84133c(ByteBuffer byteBuffer) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        return Arrays.copyOfRange(bArrArray, byteBuffer.position() + iArrayOffset, iArrayOffset + byteBuffer.limit());
    }

    /* JADX INFO: renamed from: d */
    public static String m84134d(File file, int i11) {
        byte[] bArrM84131a = m84131a(file, i11);
        if (bArrM84131a == null) {
            return null;
        }
        try {
            return new String(bArrM84131a, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
