package com.facebook.soloader;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p852kotlin.UShort;

/* JADX INFO: loaded from: classes45.dex */
public class Manifest {
    public final String arch;
    public final List<String> libs;

    public static Manifest read(InputStream inputStream) throws IOException {
        return read(new DataInputStream(inputStream));
    }

    public static Manifest read(DataInputStream dataInputStream) throws IOException {
        String arch = readArch(dataInputStream);
        int i11 = dataInputStream.readShort() & UShort.MAX_VALUE;
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(readLib(dataInputStream));
        }
        return new Manifest(arch, arrayList);
    }

    public Manifest(String str, List<String> list) {
        this.arch = str;
        this.libs = Collections.unmodifiableList(list);
    }

    private static String readArch(DataInputStream dataInputStream) throws IOException {
        byte b11 = dataInputStream.readByte();
        if (b11 != 1) {
            if (b11 != 2) {
                if (b11 != 3) {
                    if (b11 == 4) {
                        return MinElf.ISA.X86;
                    }
                    throw new RuntimeException("Unrecognized arch id: " + ((int) b11));
                }
                return MinElf.ISA.X86_64;
            }
            return MinElf.ISA.ARM;
        }
        return MinElf.ISA.AARCH64;
    }

    private static String readLib(DataInputStream dataInputStream) throws IOException {
        byte[] bArr = new byte[dataInputStream.readShort() & UShort.MAX_VALUE];
        dataInputStream.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }
}
