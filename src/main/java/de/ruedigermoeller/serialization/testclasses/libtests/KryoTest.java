package de.ruedigermoeller.serialization.testclasses.libtests;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

import de.javakaffee.kryoserializers.UnmodifiableCollectionsSerializer;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.util.Collections;

import org.objenesis.strategy.StdInstantiatorStrategy;


/**
 * Copyright (c) 2012, Ruediger Moeller. All rights reserved.
 * <p/>
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * <p/>
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 * <p/>
 * Date: 16.06.13
 * Time: 10:35
 * To change this template use File | Settings | File Templates.
 */
public class KryoTest extends SerTest {
    Kryo kryo;
    StdInstantiatorStrategy stdInstantiatorStrategy;

    public KryoTest(String title) {
        super(title);
    }

    public String getColor() {
        return "#A0A0A0";
    }

    @Override
    public void init() {
        kryo = new Kryo();
        stdInstantiatorStrategy = new StdInstantiatorStrategy();
        kryo.addDefaultSerializer(
                Collections.unmodifiableCollection( Collections.EMPTY_LIST ).getClass(),
                UnmodifiableCollectionsSerializer.class );
        in = new Input(500*1000);
        output = new Output(500*1000);
    }

    Input in;
    @Override
    protected void readTest(ByteArrayInputStream bin, Class cl) {
        in.setInputStream(bin);
        Object res = kryo.readObject(in,cl);
        in.close();
        resObject = res;
    }

    Output output;
    @Override
    protected void writeTest(Object toWrite, OutputStream bout, Class aClass) {
        output.setOutputStream(bout);
        kryo.writeObject(output, toWrite);
        output.close();
    }
}
