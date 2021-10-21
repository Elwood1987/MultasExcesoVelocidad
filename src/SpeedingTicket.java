public class SpeedingTicket {

    public String init(String datos) {
        String[] splitData = data.split(" ");
        int distance = Integer.parseInt(splitData[0]);
        int maximumSpeed =Integer.parseInt(splitData[1]);
        int time = Integer.parseInt(splitData[2]);
        String validate = validate(distance, maximumSpeed, time);
        if (validate.equals("")) {
            return calculate(distance, maximumSpeed, time);
        } else {
            return validate;
        }
    }

    public String calculate(int distance, int maximumSpeed, int time) {
        double calculateSpeed = getSpeed(distance, time);
        if(calculateSpeed <= maximumSpeed){
            return Result.OK.name();
            } else if (calculateSpeed >= maximumSpeed * 1.20) {
            return Result.CURSO_SENSIBILIZACION.name();
        } else {
            return Result.MULTA.name();
        }
    }

    public double getSpeed(int distance, int time) {
        float speed =  ((float) distance / (float) time) * 3.6f;
        return speed;
    }

    public String validate(int distance, int maximumSpeed, int time) {
        if (distance == 0 && maximumSpeed == 0 && time == 0) {
            return Result.ERROR.name();
        }

        if (distance <= 0 || maximumSpeed <= 0 || maximumSpeed <= 0) {
            return Result.ERROR.name();
        }
        return "";
    }

    enum Result {
        OK,
        MULTA,
        CURSO_SENSIBILIZACION,
        ERROR;
    }

}
