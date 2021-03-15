/*
 * MIT License
 *
 * Copyright (c) 2021 Bowen Wu
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.github.softwarecat.world;

import io.github.softwarecat.gamerule.GameRule;
import io.github.softwarecat.room.Room;

import java.util.HashSet;
import java.util.Set;

public abstract class World {
    protected final Set<GameRule> rules = new HashSet<>();

    protected Room[][] rooms;
    protected int worldLength;
    protected int worldWidth;

    public World(int length, int width) {
        worldLength = length;
        worldWidth = width;

        rooms = new Room[worldLength][worldWidth];
    }

    public Room getRoom(int x, int y) {
        if (x < 0 || y < 0 || x > worldLength || y > worldWidth) {
            return null;
        } else {
            return rooms[y][x];
        }
    }

    public void setRoom(int x, int y, Room room) {
        rooms[y][x] = room;
    }
}
