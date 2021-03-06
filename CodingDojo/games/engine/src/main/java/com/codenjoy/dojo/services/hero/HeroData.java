package com.codenjoy.dojo.services.hero;

/*-
 * #%L
 * Codenjoy - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2016 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import com.codenjoy.dojo.services.Point;

/**
 * Created by indigo on 2016-10-30.
 */
public interface HeroData {
    /**
     * @return Координаты игрока на поле из рассчета, что [0, 0] находится в левом нижнем углу
     */
    Point getCoordinate();

    /**
     * @return true, усли игрок играет на общем поле, если же играет на своем - false
     */
    boolean isSingleBoardGame();

    /**
     * @return Возвращает номер уровня игры
     */
    int getLevel();

    /**
     * @return Дополнительные данные в любом формате
     */
    Object getAdditionalData();
}
