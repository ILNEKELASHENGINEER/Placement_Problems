import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    return list(pd.DataFrame(players).shape)

    
