package script.data;

import org.rspeer.runetek.api.movement.position.Position;

public enum Area {

        GE_AREA(org.rspeer.runetek.api.movement.position.Area.polygonal(
                new Position(3161, 3498, 0),
                new Position(3168, 3498, 0),
                new Position(3173, 3493, 0),
                new Position(3173, 3486, 0),
                new Position(3167, 3480, 0),
                new Position(3161, 3481, 0),
                new Position(3156, 3486, 0),
                new Position(3156, 3493, 0)));

        private org.rspeer.runetek.api.movement.position.Area area;

        Area(org.rspeer.runetek.api.movement.position.Area area) {
            this.area = area;
        }

        public org.rspeer.runetek.api.movement.position.Area getArea() {
            return area;
        }
}
