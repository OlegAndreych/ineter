/**
 * Copyright (c) 2018, Ineter Contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package net.bit48.ineter.range;

import java.util.Iterator;

import net.bit48.ineter.base.IPAddress;

public interface IPSubnet<T extends IPAddress> extends Iterable<T> {

	public T getNetworkMask();

	public int getNetworkBitCount();

	public int getHostBitCount();

	public T getNetworkAddress();

	public boolean contains(T address);

	public T getFirst();

	public T getLast();

	public Iterator<T> iterator(boolean skipFirst, boolean skipLast);

	public Number length();
}
