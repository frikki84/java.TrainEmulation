/**interface for Pattern Strategy to add a group of similar carriages
 * 
 */

package by.itiu.dziad.lab11.poezd.model.logic.adding;

import by.itiu.dziad.lab11.poezd.model.entity.train.Train;

public interface Addable {
	public Train addCarriagesGroup(Train train);
}
